package br.com.pinotti.authapi.service;

import br.com.pinotti.authapi.model.User;
import br.com.pinotti.authapi.security.MyToken;

public interface IUserService {
	public User addUser(User user);
	public User getByUsername(String username);
	public MyToken userLogin(User user);
}
