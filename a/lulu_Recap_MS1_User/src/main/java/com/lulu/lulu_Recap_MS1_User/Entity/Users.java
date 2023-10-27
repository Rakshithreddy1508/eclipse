package com.lulu.lulu_Recap_MS1_User.Entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="login_Details")
public class Users{

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
		int id;
		String login;
		String password;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getLogin() {
			return login;
		}
		public void setLogin(String login) {
			this.login = login;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public Users(int id, String login, String password) {
			super();
			this.id = id;
			this.login = login;
			this.password = password;
		}
		public Users() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Users [id=" + id + ", login=" + login + ", password=" + password + "]";
		}
		@Override
		public int hashCode() {
			return Objects.hash(id, login, password);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (obj == null) {
				return false;
			}
			if (getClass() != obj.getClass()) {
				return false;
			}
			Users other = (Users) obj;
			return id == other.id && Objects.equals(login, other.login) && Objects.equals(password, other.password);
		}

	}

