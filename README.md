# Google Android Fundamentals 2021 Challanges
This repository contains the solved challenges from "Atelierul Digital Google pentru Programatori 2021" Android Fundamentals course taught by Roxana Mecea, a great tutor. At every course, there were some challenges (or sometimes only one) about the topics we learned. Those challenges really helped me to understand the course better but also how android development works. The first course challenge was about creating a Github account and pushing a "Hello World" project, so I skipped this one since I was already familiar with git and Github.


## Course 2 - Views
In this course we learned about `TextView`, andorid screen resolution comparision, gravity, `ImageView`, `Button`, `View`, `EditText`, `CheckBox`, `RadioButton`, `RatingBar`, `Switch`, `SeekBar`, `SearchView`, `ProgressBar` and `LinearLayout`. This course had only one challenge.
### Code Challenge No. 1:
Create a new project in Android Studio and build the next layout: </br></br>
![Views Challenge 1](https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-2/views-chall-no1.png?raw=true)
#### My solution
For this solution I've also added Toast messages (and added into the Log) when the user interacted with any of the UI. I added a volume bar with `Seekbar`, an search bar with `SearchView` and a circular `ProgressBar`. </br></br>
<img src="https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-2/views-solution-no1-v1.jpeg?raw=true" alt="Views Challenge 1 Solution" width="300px">


## Course 3 - View Groups
This course was about `ScrollView`, `FrameLayout`, `WebView`, `RelativeLayout` and `Spinner`. This course had two challenges.
### Code Challenge No. 1 - Login:
Build the next layout:
- create another TextView that will display the information filled in the form (Text from the inputs && True or false for checkbox value)
- please validate the data, all the fields are required
- the email address field should contain a valid email address (Hint: use Regex) </br></br>
![ViewGroups Challenge 1](https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-3/viewgroups-chall-no1.png?raw=true)
#### My solution
For the email validation I used the Matcher and Pattern classes from `java.util.regex`, I used a pattern for email and compiled intro a variable that is Pattern type, after that I wrote a method that check if the introduced email matches the pattern, the method has a `boolean` return type. </br></br>
<img src="https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-3/viewgroups-solution-no1-v1.png?raw=true" alt="ViewGroups Challenge 1 Solution" width="600px">
### Code Challenge No. 2 - ScrollArray
Build the next layouts by using:
- `ScrollView` and `RelativeLayout` for the screen no. 1 and no. 2
- `FrameLayout` for the screen no. 3
- `Spinner` for the screen no. 4 and no. 5 </br></br>
![ViewGroups Challenge 2](https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-3/viewgroups-chall-no2.png?raw=true)
#### My solution
![ViewGroups Challenge 2 Solution](https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-3/viewgroups-solution-no2-v1.png?raw=true)


## Course 4 - Complex Views
This course mainly focused on `RecyclerView` and `ConstraintLayout`, with their characteristics, also it was about the landscape and portrait design. This course had three challenges.
### Code Challenge No. 1 - Recap:
**Recap challenge**: use the UI elements covered in courses 2 and 3 in order to optain the layout with the next design. </br></br>
![Complex Views Challenge 1](https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-4/complexviews-chall-no1.png?raw=true)
#### My solution
<img src="https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-4/complexviews-solution-no1-v1.jpeg?raw=true" alt="Complex Views Challenge 1 Solution" width="300px">

### Code Challenge No. 2 - Students:

Create a `RecyclerView` that contains a list of students. A student has a first name and a last name. Alternate the background of the item based on its index. Hint: use the adapter. </br></br>

![Complex Views Challenge 2](https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-4/complexviews-chall-no2.png?raw=true)

#### My solution
Here I also added the option to add and to delete a student. </br></br>
<img src="https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-4/complexviews-solution-no2-v1.jpeg?raw=true" alt="Complex Views Challenge 2 Solution" width="300px">
### Code Challenge No. 3 - HolidayCard:
Create the next layout by using `ConstraintLayout`. </br></br>
![Complex Views Challenge 3](https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-4/complexviews-chall-no3.png?raw=true)
#### My solution
<img src="https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-4/complexviews-solution-no3-v1.jpeg?raw=true" alt="Complex Views Challenge 3 Solution" width="300px">


## Course 5 - Activities and Intents
In this course we learned about `Activity` Lifecycle, implicit and explicit `Intents`, `Bundle` and `Debugging`. This course had four challenges.
### Code Challenge No. 1 - Activities LifeCycle:
Create two activities and implement all the methods from the activity lifecycle. On the first activity add a button that will redirect the user to the second activity. Inside of each method add a Log message with the name of the current class and the name of the method. Analyze the messages on the Logcat
#### My solution
<img src="https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-5/activityandintent-solution-no1.png?raw=true" alt="Activities and Intents Challenge 1 Solution" width="600px">

### Code Challenge No. 2 - Passage Activity:

Create an app/activity with three Button elements labeled Text One, Text Two, and Text Three. When any of these Button elements are clicked, launch a second Activity. That second Activity should contain a ScrollView that displays one of three text passages (you can include your choice of passages). Use an Intent to launch the second Activity with extras to indicate which of the three passages to display.

#### My solution

![Activities and Intents Challenge 2 Solution](https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-5/activityandintent-solution-no2.png?raw=true)

### Code Challenge No. 3 - Chat App:

Create 2 activities: Activity1 and Activity2. Each activity has an EditText and a Button displayed on the bottom of the screen. On top of the screen, each activity has 2 TextViews, one after the other one, in a vertical position. The first TextView is bold. </br>
Flow to cover:
- The user opens Activity1, writes a message in EditText, clicks on the SEND button and the text is sent to Activity2. In this step, in Activity1, both TextViews from the top are empty.
- On Activity2 the text received from Activity1 is displayed in the second TextView and for the first TextView from the screen is set the text "Message received".
- In Activity2 the user writes a message in EditText and clicks SEND
- Activity2 is destroyed (closed) and Activity1 appears.
- In Activity1, on top of the screen, the first TextView is populated with "Reply received" and the second one with the message received from Activity2. </br></br>

![Activities and Intents Challenge 3](https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-5/activityandintent-chall-no3.png?raw=true)

#### My solution

<img src="https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-5/activityandintent-solution-no3.png?raw=true" alt="Activities and Intents Challenge 3 Solution" width="600px">

### Code Challenge No. 4 - Share data:
By using implicit Intent implement the next tasks:
- Open an URL in a browser
- Open a location in the maps app
- Share a text to other apps
- Call a phone number </br></br>
![Activities and Intents Challenge 4](https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-5/activityandintent-chall-no4.png?raw=true)
#### My solution
![Activities and Intents Challenge 4 Solution](https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-5/activityandintent-solution-no4.png?raw=true)

## Course 6 - Navigation and User Interaction
This course was about `Fragmens`, more exactly their usage, their lifecycle and communication with fragments, we also learned about user navigation elements such as `NavigationDrawer`, `Up button` and `Tabs`. This course had a total of 7 challenges but the first 5 was implementing what was in the course and the last one was optional.
### Code Challenge No. 1-5 - Slides:
Create a comunication between Fragment and Activity using Bundle, methods and interface listener.
#### My solution

<img src="https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-6/fragments-solution-no5-v1.jpeg?raw=true" alt="Fragments Challenge 1-5 Solution" width="300px">

### Code Challenge No. 6 - Navigation Drawer:
Create a new app with a navigation drawer. When the user taps a navigation drawer choice, close the drawer and display a Toast message showing which choice was selected.
#### My solution

![Fragments Challenge 6 Solution](https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-6/fragments-solution-no6.png?raw=true)

### Code Challenge No. 7 (*optional) - Tabs App:
Create a new app with 3 tabs that contain:
- The first tab contains the name and the poster of your favorite movie
- The second tab contains a picture of your favorite pet
- The third tab contains the name and the picture of your favorite food
#### My solution

![Fragments Challenge 7 Solution](https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-6/fragments-solution-no7.png?raw=true)


## Course 7 - Styles and more
Here we learned about `CardView`, themes, styles, `Material Design`, Support Libraries and `Permissions`. This course had 4 challenges and the last one was optional.
### Code Challenge No. 1 - CardView Hobby:
Create a `CardView` about one of your hobbies.
#### My solution
Only one CardView for my hobby seemed a bit empty, so I added another one that would represent my business card. </br></br>
<img src="https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-7/styles-solution-no1.jpeg?raw=true" alt="Styles Challenge 1 Solution" width="300px">
### Code Challenge No. 2 - Battery Control:
Create an app that displays an `ImageView` and plus and minus buttons, as shown below. The `ImageView` contains a level list drawable that is a battery level indicator. Tapping the plus or minus button changes the level of the indicator. Use the battery icons from the `Vector Asset Studio` to represent 7 different values for the battery level. The app should have the following properties:
- The plus button increments the level, causing the battery indicator to apear more full.
- The minus button decremnts the level, causing the indicator to empty one level. </br></br>
![Styles Challenge 2](https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-7/styles-chall-no2.png?raw=true)
#### My solution
I implemented 7 values for the battery level but also two more for when it's empty and one for when it's full. </br></br>
![Styles Challenge 2 Solution](https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-7/styles-solution-no2.png?raw=true)
### Code Challenge No. 3 - Custom DateTimePicker:
Create a `DateTimePicker` with a custom theme, like in the example below: </br></br>
![Styles Challenge 3](https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-7/styles-chall-no3.png?raw=true)
#### My solution
![Styles Challenge 3 Solution](https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-7/styles-solution-no3.png?raw=true)
### Code Challenge No. 4 (*optional) - Collapsing Toolbar:
Create a screen by using `CollapsingToolbarLayout`.
#### My solution
<img src="https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-7/styles-solution-no4.png?raw=true" alt="Styles Challenge 4 Solution" width="600px">


## Course 8 - Networking
In this course the teacher told us about the following Networking topics: threading in Android, HTTP requests (GET and POST), and Retrofit where we used Postman Tool to test endpoints. This course had only one challenge
### Code Challenge No. 1 - Retro-Fit Movies:
Create an account on this website https://www.themoviedb.org/ in order to get a new API key. Create a small project with 3 screens that will display:
- Top-rated movies
- Upcoming movies
- Now playing movies 
#### My solution
This was one of my favorite projects from the whole course, so I wanted to combine almost everything I've learned so far inside this project, so beside the `Retrofit` functionality I've used `CardView` for each movie, `RecyclerView` for the list of movies and `Fragments` for each type of movie (top-rated, upcoming, now playing). I decided to get the title, the description, the image, the vote count, popularity for now playing and the release date for upcoming. </br></br>
![Networking Challenge 1 Solution](https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-8/networking-solution-no1.png?raw=true)


## Course 9 - Store Data
This was the last course and we learned about `SharedPreferences` and a local database with `SQLite` (Room). There were two challenges.
### Code Challenge No. 1 - SharedPreferences:
Implement a registration screen and save the data in SharedPreferences. The screen should contain data about the user as follows:
- First name (`EditText`)
- Last name (`EditText`)
- Email (`EditText`)
- Password (`EditText`)
- Accept Terms and Conditions (`CheckBox`)
- Save (`Button`) - will save the data in SharedPreferences
- Clear (`Button`) - will delete the data from SharedPreferences
- Display data(`TextView`)
- Show (`Button`) - will display the data from SharedPreferences or the "Empty" word if it's empty. </br></br>
#### My solution

<img src="https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-9/storedata-solution-no1.png?raw=true" alt="Store data Challenge 1 Solution" width="600px">

### Code Challenge No. 2 - Project Manager:

Build your own database with Projects and create the next screens:
- A screen to display the list of the saved projects
- A screen to add or edit a current project
- A screen to display the tasks from a selected project
- A screen to add or edit a task from a selected project </br></br>

The data will be saved in an SQLite database using Room. </br></br>

The Project object should contain:
- ID
- Name
- Description
- Estimated Hours </br></br>

The Task object should contain:
- ID
- Name
- Description
- Estimated time
- Worked time
- Project ID
</br></br>

#### My solution

![Store data Challenge 2 Solution v1](https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-9/storedata-solution-no2-v1.png?raw=true)
</br>
![Store data Challenge 2 Solution v2](https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-9/storedata-solution-no2-v2.png?raw=true)

## Course 10 - Demo Day
Here I had to work on a personal project to get the diploma, you can check it out here: https://github.com/brittleru/Android-Fundamentals-2021-Project








