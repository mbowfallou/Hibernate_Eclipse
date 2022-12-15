package com.groupeisi;

import com.groupeisi.entities.Role;
import com.groupeisi.entities.User;
import com.groupeisi.repository.IRole;
import com.groupeisi.repository.IUser;
import com.groupeisi.repository.RoleImpl;
import com.groupeisi.repository.UserImpl;

public class Main {

	public static void main(String[] args) {
		
		IRole iRole = new RoleImpl();
		IUser iUser = new UserImpl();
		
		Role role = new Role();	
		role.setNom("ROLE_SUPERADMIN");
		
		User user = new User();
		
		user.setPrenom("Ousmane");
		user.setNom("GUEYE");
		user.setEmail("ous@gmail.com");
		user.setPassword("passer");
		user.setEtat(1);
		//user.setRoles(role);
		
		int result0 = iUser.saisie(user);
		int result = iRole.saisie(role);
		
		if(result0 == 1) 
			System.out.println("Insertion User avec succss.");
		else 
			System.out.println("Insertion User echouee !!!");
			
		if(result == 1) 
			System.out.println("Insertion Role avec succss.");
		else 
			System.out.println("Insertion Role echouee !!!");

	}

}
