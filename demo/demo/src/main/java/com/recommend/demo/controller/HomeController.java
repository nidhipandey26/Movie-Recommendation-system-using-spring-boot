package com.recommend.demo.controller;

import com.recommend.demo.model.Movie;
import com.recommend.demo.service.MovieService;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.neighborhood.ThresholdUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.CityBlockSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.UserBasedRecommender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.File;
import java.util.List;

@RestController
@RequestMapping("/watch")
@CrossOrigin(origins = "http://localhost:4200")
public class HomeController {

    @Autowired
    MovieService movieService;

    @GetMapping("/movies")
    public List<Movie> movies() {
        return movieService.getMovies();
    }

    @GetMapping("/predict")
    public void predict() {
        try {
            DataModel model = new FileDataModel(new File("C:\\Users\\nidhi\\Desktop\\AI ML NLP\\demo\\demo\\src\\main\\resources\\MDist1.csv"));
            CityBlockSimilarity similarity = new CityBlockSimilarity(model);
            UserNeighborhood neighborhood = new ThresholdUserNeighborhood(0.1, similarity, model);
            UserBasedRecommender recommender = new GenericUserBasedRecommender(model, neighborhood, similarity);

            // The First argument is the userID and the Second parameter is 'HOW MANY'
            List<RecommendedItem> recommendations = recommender.recommend(2, 2);

            for (RecommendedItem recommendation : recommendations) {
                System.out.println(recommendation);
            }
        } catch (Exception e) {
            System.out.println("Exception occured !");
        }
    }
    @PostMapping("add")
    public void addMovies(@RequestBody @Valid Movie movie){
        movieService.addMovies(movie);

    }
}
