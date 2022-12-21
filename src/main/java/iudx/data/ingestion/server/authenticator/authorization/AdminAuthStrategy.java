package iudx.data.ingestion.server.authenticator.authorization;

import static iudx.data.ingestion.server.authenticator.authorization.Method.DELETE;
import static iudx.data.ingestion.server.authenticator.authorization.Method.POST;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import iudx.data.ingestion.server.authenticator.model.JwtData;
import iudx.data.ingestion.server.common.Api;

public class AdminAuthStrategy implements AuthorizationStrategy {
  private static final Logger LOGGER = LogManager.getLogger(AdminAuthStrategy.class);

  static Map<String, List<AuthorizationRequest>> AdminAuthorizationRules = new HashMap<>();
  private final Api apis;
  public AdminAuthStrategy(Api apis) {
    this.apis=apis;
  }

  @Override
  public boolean isAuthorized(AuthorizationRequest authRequest, JwtData jwtData) {
    return true;
  }

}
