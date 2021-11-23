# V2G
CODE IS IN MASTER BRANCH

Original App Design Project - README Template
===

# V2G (Voice-To-Go)

## Table of Contents
1. [Overview](#Overview)
1. [Product Spec](#Product-Spec)
1. [Wireframes](#Wireframes)
2. [Schema](#Schema)

## Overview
### Description
[A mobile food ordering app that allows its users to order food by voice activation.  ]

### App Evaluation
[Evaluation of your app across the following attributes]
- **Category:** Food & Drink
- **Mobile:** Uses audio and real-time features to order food. 
- **Story:** The "" app will make ordering food more accesible to persons with diabilities. 
- **Market:** Anyone that wants to order food is able to utilize the app. More impotantly it will cater to persons with disabilities. 
- **Habit:** Possible habit forming due to the ease of ordering food via voice activation. Users can easily open the app and say their order for breakfast, lunch or dinner without hassle. 
- **Scope:** Expanding the app to include more restaraunts and ensure the voice recognition is able to translate voices with speech impediments, accents, and different languages. 

## Product Spec

### 1. User Stories (Required and Optional)

**Required Must-have Stories**

* [X] Create a log-in page
* [X] Create users for database
* [] Create home screen
* Add microphone widget
* Create confirmation screen
* Add payment processor
* Thank you screen

**Optional Nice-to-have Stories**


* Uer is able to view previous orders
* User is able to save orders
* Create a rewards system

### 2. Screen Archetypes

* Welcome Screen
    * Choose a location.
* Microphone widget
    * Utilize microphone widget.
* Review order screen 
    * Confirm all orders
* Enter payment Information screen
    * Different payment vendors available.
    * Insert contact information.
* Order confirmation screen
    * Recieve order confirmation number
    * Recieve an estimated wait time.
* Thank you screen
    * How to accept delivery 
    * Thank the customer for ordering

### 3. Navigation

**Tab Navigation** (Tab to Screen)

* Home
* Orders
* Account
* Cart

**Flow Navigation** (Screen to Screen)

* Welcome Screen
* Microphone widget
* Review order screen 
* Enter payment Information screen
* Order confirmation screen
* Thank you screen

## Wireframes
<img src="https://i.imgur.com/IXXYK2u.jpg" width=300>

### [BONUS] Digital Wireframes & Mockups
<p float="left"> 
    <img src="https://i.imgur.com/vJiA1zR.png" width="150">
    <img src="https://i.imgur.com/uUhvkiT.png" width="150">
    <img src="https://i.imgur.com/HQKcdSz.png" width="150">
    <img src="https://i.imgur.com/Emid8WD.png" width="100">
    <img src=https://i.imgur.com/8qSjxhi.png"" width="150">
    <img src="https://i.imgur.com/BySk2KG.png" width="150">
    <img src="" width="150">
    <img src="" width="150">
</p>


### [BONUS] Interactive Prototype

## Schema 
[This section will be completed in Unit 9]
### Models

|Property  | Type      | Description    |
| -------- | --------  | -------- |
| objectID | String    | unique id for the user post (default field)
|user      | String    | Author of profile
|image     | String    | Image user uses for profile
|createdAt | File      | Image user uses for profile
|email     | String    | Email user uses to make a profile
|password  | String    | Password used to create a profile


### Networking
Home screen sign up

(Create) Create a user

	import com.parse.SignUpCallback;



	ParseUser user = new ParseUser();
     // Set the user's username and password, which can be obtained by a forms
     user.setUsername( "<Your username here>");
     user.setPassword( "<Your password here>");
     user.signUpInBackground(new SignUpCallback() {
         @Override
         public void done(ParseException e) {
             if (e == null) {
                 showAlert("Successful Sign Up!", "Welcome" + "<Your username here>" +"!");
             } else {
                 ParseUser.logOut();
                 Toast.makeText(SignUpActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();
             }
         }
     });

Account Log-in 




(Read) Log-in user
	
	private void login(String username, String password) {
     progressDialog.show();
     ParseUser.logInInBackground(username, password, (parseUser, e) -> {
         progressDialog.dismiss();
         if (parseUser != null) {
             showAlert("Successful Login", "Welcome back " + username + " !");
         } else {
             ParseUser.logOut();
             Toast.makeText(LoginActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();
         }
     });
 }


(Delete) Log-out a user

	ParseUser.logOutInBackground(e -> {
            progressDialog.dismiss();
            if (e == null)
                showAlert("So, you're going...", "Ok...Bye-bye then");
    });


	
### Login Screenshots
(working on a gif walkthrough)

<img src="https://user-images.githubusercontent.com/57336741/142354050-79695d4e-6be5-4407-83bd-00f65c1d8bba.jpg">
<img src="https://user-images.githubusercontent.com/57336741/142354293-0cc28a16-48ba-47da-967c-e4a739605559.jpg)">
<img src="https://user-images.githubusercontent.com/57336741/142354306-d181d266-0fbe-46b6-b7bc-19b0ee06d107.jpg)">
<img src="https://user-images.githubusercontent.com/57336741/142354320-3b71f463-9d68-414b-889d-989743c9dca4.jpg)">


<img src='https://github.com/GroupOneIntro2Mobile/GroupOne-/blob/main/V2Gapp.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />
