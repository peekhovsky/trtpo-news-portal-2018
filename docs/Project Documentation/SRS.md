# Requirements Document
### Contents
1. [Introduction](#1)
2. [User Requirements](#2) <br>
  2.1. [Software Interfaces](#2.1) <br>
  2.2. [User Interfaces](#2.2) <br>
  2.3. [User Characteristics](#2.3) <br>
  2.4. [Assumptions and Dependencies](#2.4) <br>
3. [System Requirements](#3.) <br>
  3.1 [Functional Requirements](#3.1) <br>
  3.2 [Non-Functional Requierements](#3.2) <br>
    3.2.1 [Software Quality Attributes](#3.2.1) <br>
    3.2.1.1 [External Quality Criteria](#3.2.1.1) <br>
    3.2.1.2 [Internal Quality Criteria](#3.2.1.2) <br>
4. [Analogues](#4) <br>

### 1\. Intoduction <a name="1"></a>
Physical newspapers are dying nowadays because people use their devices to be informed about everything that happens around. That would be useful for news companies to have good equipment to make their web newspapers easier.
That is what we are going to make in this project.

### 2\. User Requirements <a name="2"></a>
#### 2.1\. Software Interfaces <a name="2.1"></a>
This app uses Spring framework for web application and relational database for storing data.
#### 2.2\. User Interfaces <a name="2.2"></a>
This app uses Spring framework for web application and SQL database for storing data.
Interface should be easy for regular user who just read this site. Steps to make it is down below.

Button | Event
--- | ---
"Find" | A scroll bar pops up, with which you can adjust the sound
"Read more" | Play of the selected
"Sign in" | Stop playing audio recordings
"Save as draft " | Saves everything that you have made as draft without publishing 
"Publish" | Publishes your text
"Sign out" | Goes to plain version of site

There are mocaps of [main page](https://github.com/peekhovsky/trtpo-news-portal-2018/blob/master/docs/Mockups/main-page.png) and [news editing](https://github.com/peekhovsky/trtpo-news-portal-2018/blob/master/docs/Mockups/news-editing.png).
 
#### 2.3\. User Characteristics <a name="2.3"></a>
Target Users:
* Small companies (especially publish companies) that have to make their own website with news
* Person or group of people that have something to share on the Internet
* Any companies that need plain website for event temporarily

#### 2.4\. Assumptions and Dependencies <a name="2.4"></a>
This project does not include mobile version of website. If you open it in mobile device, there will be usual desktop version.

### 3\. System Requirements <a name="3"></a>
Open this website using any modern device that has a web browser. 

#### 3.1\. Functional Requirements <a name="3.1"></a>
Function | Requirements
--- | ---
Read news | Simple interface with possibility to observe many news with small description in one page. Pushing link/button “read more” to see full information
Switch to admin mode | A part of web page responsible for singing in admin profile. Text fields for login and password and button “sign in”.
Add news | Text area with tools for editing text. Button “save draft” to continue editing later, “publish” to push this news on main page.
Delete news | Button “delete” in admin mode to remove news from website
Search | Text field and button “find” to find web page that user need. 

#### 3.2\. Non-Functional Requierements <a name="3.2"></a>
##### 3.2.1\. Software Quality Attributes <a name="3.2.1"></a>
##### 3.2.1.1 External Quality Criteria <a name="3.2.1.1"></a>
That work fast in every device that is popular now (nobody wants to use low-speed resources). Furthermore, that is important to make simple interface, and beautiful design due to users like to use well-done portals. 
### 4\. Analogues <a name="4"></a>
There is some analogues. User can make simple sites using [Blogspot](https://www.blogger.com/) and [Wix](https://wix.com/)
