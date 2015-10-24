package hu.schonherz.training.java.solid.account.validation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

import hu.dupetya.web.account.AccountRegistrationRequest;
import hu.schonherz.training.java.solid.validator.Violation;
import hu.schonherz.training.java.solid.validator.rule.ValidationRule;

public class MandatoryEmailRule implements ValidationRule<AccountRegistrationRequest> {

  @Override
  public List<Violation> validate(AccountRegistrationRequest object) {
    Validate.notNull(object);
    return StringUtils.isBlank(object.getEmail()) ? Arrays.asList(new Violation("email",
        "Email address must be entered")) : Collections.<Violation>emptyList();
  }

}
