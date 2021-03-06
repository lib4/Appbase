package com.appbase.activities;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
/**
 * 
 * @author aabuback
 * 
 * This class acts a base class for all the activity which is being created in the app.
 * All the Activities should extend this class.
 * The most commonly used function Example: Saving the state, memory clearing etc needs to e handled only in this class.
 * 
 */
public class BaseActivity extends FragmentActivity{
	
	/**
	 * Called when the activity is starting.
	 */
	 protected void onCreate(Bundle savedInstanceState){
		 super.onCreate(savedInstanceState);
		 
	 }   
	 
	 /**
	  * Called after onCreate(Bundle) � or after onRestart() when the activity
	  *  had been stopped, but is now again being displayed to the user.
	  */
	 protected void onStart(){
		 super.onStart();
		 
	 }   
	 
	 /**
	  * Called after onStop() when the current activity is
	  *  being re-displayed to the user (the user has navigated back to it).
	  */
	 protected void onRestart(){
		 super.onRestart();
		 
	 }     
	 
	 /**
	  * Called after onRestoreInstanceState(Bundle), onRestart(), or onPause(), for
	  *  your activity to start interacting with the user.
	  */
	 protected void onResume(){
		 super.onResume();
		 
	 }  
	 
	 
	 /**
	  * Called as part of the activity lifecycle when an activity is going into the background,
	  *  but has not (yet) been killed.
	  */
	 protected void onPause(){
		 super.onPause();
		 
	 } 
	 
	 /**
	  * Called when you are no longer visible to the user.
	  */
	 protected void onStop(){
		 super.onStop();
	 }   
	 
	 /**
	  * Perform any final cleanup before an activity is destroyed.
	  */
	 protected void onDestroy(){
		 super.onDestroy();
		 
	 }
	

}
