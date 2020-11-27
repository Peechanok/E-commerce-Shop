package com.shop.shops.service;


import java.io.FileInputStream;
import java.io.InputStream;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
//@Service  
//public class FirebaseInitializer {  
//@PostConstruct  
//public void initialize() {  
//try {  
//
//FileInputStream serviceAccount =
//  new FileInputStream("./keys/shops-1c2f9-firebase.json");
//
//FirebaseOptions options = new FirebaseOptions.Builder()
//  .setCredentials(GoogleCredentials.fromStream(serviceAccount))
//  .setDatabaseUrl("https://shops-1c2f9.firebaseio.com")
//  .build();
//
//FirebaseApp.initializeApp(options);
//
//} catch (Exception e) {  
//e.printStackTrace();  
//}}}
import com.google.firebase.cloud.FirestoreClient;


@Service
public class FirebaseInitializer {

    @PostConstruct
    public void initialize() {
        try {
        	InputStream serviceAccount = new FileInputStream("./keys/shops-1c2f9-firebase.json");
        	GoogleCredentials credentials = GoogleCredentials.fromStream(serviceAccount);
        	@SuppressWarnings("deprecation")
			FirebaseOptions options = new FirebaseOptions.Builder()
        	    .setCredentials(credentials)
        	    .setDatabaseUrl("https://shops-1c2f9.firebaseio.com")
        	    .build();
        	FirebaseApp.initializeApp(options);
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
	public Firestore getFirebase() {
    	Firestore db = FirestoreClient.getFirestore();
    	return db;
	}
}