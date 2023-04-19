package service;

import data.model.User;
import dto.requests.RegisterUserRequest;

public interface UserService {
    User registerNewUser(RegisterUserRequest registerUserRequest);
    User findUser(int id);
}
