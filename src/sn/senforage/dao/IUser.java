package sn.senforage.dao;

import sn.senforage.entities.User;

public interface IUser {
	public User getAll(String  username, String password);

	User getAll(String username);
}
