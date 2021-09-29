# Google Android Fundamentals 2021 Challanges
This repository contains the solved challenges from "Atelierul Digital Google pentru Programatori 2021" Android Fundamentals course taught by Roxana Mecea, a great tutor. At every course, there were some challenges (or sometimes only one) about the topics we learned. Those challenges really helped me to understand the course better but also how android development works. The first course challenge was about creating a Github account and pushing a "Hello World" project, so I skipped this one since I was already familiar with git and Github.


## Course 2 - Views
In this course we learned about `TextView`, andorid screen resolution comparision, gravity, `ImageView`, `Button`, `View`, `EditText`, `CheckBox`, `RadioButton`, `RatingBar`, `Switch`, `SeekBar`, `SearchView`, `ProgressBar` and `LinearLayout`. This course had only one challenge.
### Code Challenge No. 1:
Create a new project in Android Studio and build the next layout: </br></br>
![Views Challenge 1](https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-2/views-chall-no1.png?raw=true)
#### My solution
For this solution I've also added Toast messages (and added into the Log) when the user interacted with any of the UI. I added a volume bar with `Seekbar`, an search bar with `SearchView` and a circular `ProgressBar`. </br>

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
For the email validation I used the Matcher and Pattern classes from `java.util.regex`, I used a pattern for email and compiled intro a variable that is Pattern type, after that I wrote a method that check if the introduced email matches the pattern, the method has a `boolean` return type. </br>

<img src="https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-3/viewgroups-solution-no1-v1.png?raw=true" alt="ViewGroups Challenge 1 Solution" width="600px">
### Code Challenge No. 2 - ScrollArray
Build the next layouts by using:
- `ScrollView` and `RelativeLayout` for the screen no. 1 and no. 2
- `FrameLayout` for the screen no. 3
- `Spinner` for the screen no. 4 and no. 5 </br></br>
![ViewGroups Challenge 2](https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-3/viewgroups-chall-no2.png?raw=true)
#### My solution
At this challenge for the spinner I used `simple_spinner_item` for the layout and I hardcoded the data-source for it in an ArrayList wtih Android versions, after that I wrote a simple method for the adapter. 

![ViewGroups Challenge 2 Solution](https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-3/viewgroups-solution-no2-v1.png?raw=true)


## Course 4 - Complex Views
This course mainly focused on `RecyclerView` and `ConstraintLayout`, with their characteristics, also it was about the landscape and portrait design. This course had three challenges.
### Code Challenge No. 1 - Recap:
**Recap challenge**: use the UI elements covered in courses 2 and 3 in order to optain the layout with the next design. </br></br>
![Complex Views Challenge 1](https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-4/complexviews-chall-no1.png?raw=true)
#### My solution
This was mainly a design challenge, so all the work was inside the `activity_main.xml` file. For the main parent view I used `RelativeLayout`, then for the two images I used another `RelativeLayout` and inside it the images had the `layout_alignParentStart` and `layout_alignParentEnd` attribute set to `true`. For the small line between the top images and the rest of the screen I used a simple `View`. For the last part, I used a `FrameLayout` with 3 `View`'s and one `ImageView`.

<img src="https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-4/complexviews-solution-no1-v1.jpeg?raw=true" alt="Complex Views Challenge 1 Solution" width="300px">

### Code Challenge No. 2 - Students:

Create a `RecyclerView` that contains a list of students. A student has a first name and a last name. Alternate the background of the item based on its index. Hint: use the adapter. </br></br>

![Complex Views Challenge 2](https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-4/complexviews-chall-no2.png?raw=true)

#### My solution
At this challenge I was amazed by how usefull can a `RecyclerView` be but also by how much code I have to write for it's functionality :D. I used a `LinkedList` for the name list and added a click functionality for each element of the data source, also, I added the option to add and to delete a student and used `smoothScrollToPosition` function for a better user interaction. </br></br>
<img src="https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-4/complexviews-solution-no2-v1.jpeg?raw=true" alt="Complex Views Challenge 2 Solution" width="300px">
### Code Challenge No. 3 - HolidayCard:
Create the next layout by using `ConstraintLayout`. </br></br>
![Complex Views Challenge 3](https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-4/complexviews-chall-no3.png?raw=true)
#### My solution
Yet another design challenge, but, this time was about the `ConstraintLayout`, I also used some `LinearLayouts` and `RelativeLayouts`. 

<img src="https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-4/complexviews-solution-no3-v1.jpeg?raw=true" alt="Complex Views Challenge 3 Solution" width="300px">


## Course 5 - Activities and Intents
In this course we learned about `Activity` Lifecycle, implicit and explicit `Intents`, `Bundle` and `Debugging`. This course had four challenges.
### Code Challenge No. 1 - Activities LifeCycle:
Create two activities and implement all the methods from the activity lifecycle. On the first activity add a button that will redirect the user to the second activity. Inside of each method add a Log message with the name of the current class and the name of the method. Analyze the messages on the Logcat
#### My solution
This challenge was about studying the activities behavior, I had to override the `onCreate()`, `onStart()`, `onResume()`, `onPause()`, `onStop()`, and `onDestroy()` methods so when they were called it their equivalent `TextView` color will become green and it will be appended " called" to its text.

<img src="https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-5/activityandintent-solution-no1.png?raw=true" alt="Activities and Intents Challenge 1 Solution" width="600px">

### Code Challenge No. 2 - Passage Activity:

Create an app/activity with three Button elements labeled Text One, Text Two, and Text Three. When any of these Button elements are clicked, launch a second Activity. That second Activity should contain a ScrollView that displays one of three text passages (you can include your choice of passages). Use an Intent to launch the second Activity with extras to indicate which of the three passages to display.

#### My solution
In this challenge I've used a method with had a parameter of type `View` in order to get the ID of the button, I instantiated the `Intent` and then in a `switch` case, I checked for every ID, if the case was `true` it would `putExtra()` information for the intent with the key being a string "Button" and the value different for every button. Then in the second activity I used another `switch` case to check for the data sent from the `Intent` so I could change the information from the, `TextView`s and the `ImageView`.

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
For this challenge, in the `MainActivity` I used an `addTextChangedListener()` who would listen `onTextChanged()`, then an `clickListener` which would run a method on that would start a new activity on click and then would send the message to the next activity, I also overrided the `onPause()` method in order to finish the `MainActivity`. I did the same for the second activity.

<img src="https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-5/activityandintent-solution-no3.png?raw=true" alt="Activities and Intents Challenge 3 Solution" width="600px">

### Code Challenge No. 4 - Share data:
By using implicit Intent implement the next tasks:
- Open an URL in a browser
- Open a location in the maps app
- Share a text to other apps
- Call a phone number </br></br>
![Activities and Intents Challenge 4](https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-5/activityandintent-chall-no4.png?raw=true)
#### My solution
Here I added `addTextChangedListener()`s for each `EditText` and `clickListener`s for each `Button`. For the most buttons I used `Permissions`. On click for the `URL`, I used `Intent.ACTION_VIEW` and I set up the data for the intent to parse for whatever the user entered. For the location I again used `ACTION_VIEW` and sanitized the string by adding "google.navigation:q=" in front of whatever the user introduced. For the share button I had to use `ACTION_SEND`, send the data to the next activity and let the user choose which application he wants to share with. Finally, for the dial button I used the `ACTION_DIAL`, sanitized the string to with "tel:" in front of it and set up the data to parse that Uri.

![Activities and Intents Challenge 4 Solution](https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-5/activityandintent-solution-no4.png?raw=true)

## Course 6 - Navigation and User Interaction
This course was about `Fragmens`, more exactly their usage, their lifecycle and communication with fragments, we also learned about user navigation elements such as `NavigationDrawer`, `Up button` and `Tabs`. This course had a total of 7 challenges but the first 5 was implementing what was in the course so it wasn't actually a challenge, and the last one was optional.

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
For this solution I used `ViewPager`, the .xml file for the fragments had two `TextViews` and one `ImageView`. In the `MainActivity` I wrote a class `MainAdapter` that extends the `FragmentPagerAdapter`, it uses two `ArrayList`s, one to add the title of the fragment and one to add the fragment, and I overrided the `getItem()`, `getCount()` and `getPageTitle()` methods. After that I wrote a method to prepare the `ViewPager` there I used `getSupportFragmentManager()` to create the `MainAdapter` object and I saved their titles in the `Bundle` object and created the fragments using a for loop. Finally in the `MainFragment` in the method `onCreateView()` I used an `switch` case to change the fragment content by using its title as cases.

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
This project was a bit hard because I had to write .xml files for each state of the battery image. I implemented 7 values for the battery level but also two more for when it's empty and one for when it's full. </br>

![Styles Challenge 2 Solution](https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-7/styles-solution-no2.png?raw=true)
### Code Challenge No. 3 - Custom DateTimePicker:
Create a `DateTimePicker` with a custom theme, like in the example below: </br></br>
![Styles Challenge 3](https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-7/styles-chall-no3.png?raw=true)
#### My solution
I know it's not the best design, but I tried :D.

![Styles Challenge 3 Solution](https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-7/styles-solution-no3.png?raw=true)
### Code Challenge No. 4 (*optional) - Collapsing Toolbar:

Create a screen by using `CollapsingToolbarLayout`.

#### My solution
This was a design challenge, I used `CoordinatorLayout` as the parrent, then inside an `AppBarLayout` I added the `CollapsingToolbarLayout` which had an `ImageView` and a `Toolbar` inside. After the `AppBarLayout` I used a `FloatingActionButton`, a `NestedScrollView` and a `TextView`.

<img src="https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-7/styles-solution-no4.png?raw=true" alt="Styles Challenge 4 Solution" width="600px">


## Course 8 - Networking
In this course the teacher told us about the following Networking topics: threading in Android, HTTP requests (GET and POST), and Retrofit where we used Postman Tool to test endpoints. This course had only one challenge
### Code Challenge No. 1 - Retro-Fit Movies:
Create an account on this website https://www.themoviedb.org/ in order to get a new API key. Create a small project with 3 screens that will display:
- Top-rated movies
- Upcoming movies
- Now playing movies 
#### My solution
This was one of my favorite projects from the whole course, so I wanted to combine almost everything I've learned so far inside this project, so beside the `Retrofit` functionality I've used `CardView` for each movie, `RecyclerView` to generate the list of movies and `Fragments` for each type of movie (top-rated, upcoming, now playing). I decided to get the title, the description, the image, the vote count, popularity for now playing movies and the release date for upcoming movies. To load the images from the `URL` I used `Glide` inside the `RecyclerView` adapter. I wrote a class (`MovieResults`) with nested classes filled with setters and getters in order to work with the data from the fetch. In the `MainActivity` I wrote a similar functionality with the optional challenge from the fragments course, and in the `MainFragment` I fetched the data from the API inside the `onCreateView()` method using a Retrofit instance in order to store the call for each category of movies in a different variable, after that with a `switch` case for the category type I wrote the functionality for the response and for the failure of the API call, in case of `ok` response I used a `foreach` loop to add the data into the `RecyclerView` adapter and in the end show the data for that category. For a better data visualization and to test the endpoints I used the `Postman` tool.</br>

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
All the functionalities have been written inside the `MainActivity`. I used a string variable `APP_KEY` and keys for each type of data, then on the create method I've added the `textChangedListeners` for the `EditText` fields and `clickListeners` for the buttons. After that I've written CRUD operation methods for the `SharedPreferences`, such as saving the data by using the key and value, reading the data using a getter function by using the key, deleting the data by using the key and deleting everything.

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
This was a pretty complex challenge. I've used Room in order to perform CRUD operations on some Projects and Tasks. For the design of the Projects and Tasks I've used `CardView` and for the images I've used `Vector Asset`, and to display the data I've used a `RecyclerView`. I've created an `abstract class` named `ProjectsDB` who had two `entities`, one for projects and one for tasks, there I've used the Singleton design pattern in order to obtain the instance of the class, in that case I didn't want to be able to create more databases with the same name, I also used a `synchronized` method in order to avoid conflicts with threads and because I didn't want to block the UI thread, this abstract class has two abstract methods `projectsDao()` and `tasksDao`. I wrote two interfaces where I wrote the queries for the CRUD operations, the interfaces were named `ProjectsDao` and `TasksDao`. After that I wrote two classes `ProjectsData` and `TasksData` which represented the tables, there I wrote the requested columns and their setters and getters, for the `TasksData` I've also added a Boolean column, to check if the task is finished or not.</br></br>
To add a project, I used a click listener for the `FloatingActionButton` where I created a `Dialog` popup which had the layout of `dialog_add_project.xml`, that layout had an `Add Project` button and a `Cancel` button, this all happened into the `MainActivity`. For the add button I've checked if the fields are not empty and if so, I added them into the database then I updated the adapter and closed the dialog. </br></br>
Inside the `RecyclerView` adapter for the Projects I wrote the functionality for the edit button and the delete button. For the edit one I used another `Dialog` object in order to create a popup window which had the same functionality as the add `FloatingActionButton`, and for the delete button I've wrote a function `askOption` which had a return type of `AlertDialog` where the negative button, named "Close", simply closed the popup and the positive button, named "Delete", removed the project from the database and from the adapter. When the user clicks on the `Tasks` button it will an `Intent` object will be instantiated the data about the project title, description, hours and ID will be sent to a new activity named `TasksActivity`. </br></br>
The `TasksActivity` have similar functionality with the `MainActivity` a.k.a. the Projects activity but here I made a new `ArrayList`, and used a `foreach` loop in order to parse the data source from the adapter, and if the project ID was the same with the `Intent` ID, I would add that task data into the new `ArrayList`, by doing that I'm sure that it will show only the tasks from the project I clicked on. The tasks `RecyclerView` adapter it's also similar to the projects adapter but I've added a functionality that if you tap on the task, the text "In Progress" will become a green text named "Done", that being possible by using the Boolean column I added into the `TasksData`.

![Store data Challenge 2 Solution v1](https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-9/storedata-solution-no2-v1.png?raw=true)
</br>
![Store data Challenge 2 Solution v2](https://github.com/brittleru/Google-Android-Fundamentals-Challenges/blob/main/README-imgs/course-9/storedata-solution-no2-v2.png?raw=true)

## Course 10 - Demo Day
Here I had to work on a personal project to get the diploma, you can check it out here: https://github.com/brittleru/Android-Fundamentals-2021-Project








