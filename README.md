# Unit 2 - Data for Social Good Project

## Introduction

Software engineers develop programs to work with data and provide information to a user. Each user has different needs based on the information they are looking for from data. Your goal is to create a data analysis program for your user that stores and analyzes data to provide the information they need.

## Requirements

Use your knowledge of object-oriented programming, one-dimensional (1D) arrays, and algorithms to create your data analysis program:
- **Write a class** – Write a class to represent your user or business and store and analyze their data with no-argument and parameterized constructors.
- **Create at least two 1D arrays** – Create at least two 1D arrays to store the data that your user needs information about.
- **Write a method** – Write a method that finds or manipulates the elements in a 1D array to provide the information your user needs.
- **Implement a toString() method** – Write a toString() method that returns general information about the data (for example, number of values in the dataset).
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions.

## User Story 

Include your User Story you analyzed for your project here. Your User Story should have the following format: 

> As a shopping enthusiast, <br> 
> I want to look for stores that carry the item(s) I want and have quality products, <br> 
> so that I can find the best clothes for my closet.


## Dataset 

Include a hyperlink to the source of your dataset used for this project. Additionally, provide a short description of each column used from the dataset, and the data type. 


Dataset: https://docs.google.com/spreadsheets/d/1mpmsaVyVPnV-F7pOv-cWYOSaqAihGMscpgo3nDXdGSM/edit?usp=sharing 
- **Item Name** (String) - name of the clothing item 
- **Category** (String) - type or category each clothing item falls under 
- **Store Name** (String) - name of the store the clothing item is sold from
- **User Rating** (double) - Ratings given of each article of clothing by previous customers 
## UML Diagram 

Put an image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here. Make sure your image file name is one work, otherwise it might not properly get displayed on this README. 

![UML Diagram for my project](blob:https://vscode.dev/398e546b-ccff-454f-a73a-3acb7ae2a9b0) 

## Description 

Write a description of your project here. In your description, include as many vocab words from our class to explain your User Story, the chosen dataset and how your project addressed that users goals. If your project used the Scanner class for user input, explain how the user will interact with your project.

Our project was made to help a shopping enthusiast find clothing items that meet their wants and needs without having to physically traverse through multiple stores. Our dataset contains the names, categories, ratings, and their corresponding stores. We used 4 1D arrays as instance variables and arrays in order to store, not modify, this information, using "String" and "double" data types. We used a file reader to access the information within each of these ".txt" files. Our program connects to our user story by helping the user locate a specific clothing item, in our case shirts, by name and with ratings of 4.5 and higher.