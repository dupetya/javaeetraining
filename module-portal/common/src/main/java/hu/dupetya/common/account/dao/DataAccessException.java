package hu.dupetya.common.account.dao;

public class DataAccessException extends Exception {

  public DataAccessException(String message) {
    super(message);
  }

  public DataAccessException(Throwable cause) {
    super(cause);
  }

  public DataAccessException(String message, Throwable cause) {
    super(message, cause);
  }

}
