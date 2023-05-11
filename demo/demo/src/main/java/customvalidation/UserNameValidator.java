package customvalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UserNameValidator implements
        ConstraintValidator<UserNameConstraint, String> {

    @Override
    public void initialize(UserNameConstraint username) {
    }

    @Override
    public boolean isValid(String username,
                           ConstraintValidatorContext cxt) {
        return username != null && username.matches("[a-z-A-z0-9]+")
                && (username.length() > 8) && (username.length() < 14);
    }

}
