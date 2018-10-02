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
Physical newspapers are dying nowadays because people use their devices to be informed about everything that happens around. That would be useful for news company to have good equipment to make their web newspaper easier.
That is what we are going to make in this project.

### 2\. User Requirements <a name="2"></a>
#### 2.1\. Software Interfaces <a name="2.1"></a>
This app uses Spring framework for web application and relational database for storing data.
#### 2.2\. User Interfaces <a name="2.2"></a>
This app uses Spring framework for web application and SQL database for storing data.
There are mocaps of [main page](https://raw.githubusercontent.com/peekhovsky/trtpo-news-portal-2018/master/docs/Mockups/main-page.png) and [news editing](https://raw.githubusercontent.com/peekhovsky/trtpo-news-portal-2018/master/docs/Mockups/news-editing.png).
Interface should be simple for regular user who just read this site. Description of what it can do is down below.

Button | Event
--- | ---
"Find" | Finds news depending on your text in the text field
"Read more" | Opens page to see full text
"Sign in" | Goes to moderator version depending on login and password
"Save as draft " | Saves everything that you have made as draft without publishing 
"Publish" | Publishes your text
"Sign out" | Goes to plain version of site

 
#### 2.3\. User Characteristics <a name="2.3"></a>
Target Users:
* Small companies (especially publish companies) that have to make their own website with news
* Person or group of people that have something to share on the Internet (bloggers, non-profit-making organisations)
* Any companies that need plain website for event temporarily

#### 2.4\. Assumptions and Dependencies <a name="2.4"></a>
This project does not include mobile version of website. If you open it in mobile device, there will be usual desktop version.

### 3\. System Requirements <a name="3"></a>
Open this website using any modern device that has a web browser. 

#### 3.1\. Functional Requirements <a name="3.1"></a>
Function | Requirements
--- | ---
Reading news | Website should have simple interface with possibility to observe many news with small description in one page. Pushing link/button “read more” to see full information
Switching to admin mode | Website should have a part responsible for singing in admin profile. Text fields for login and password and button “sign in”.
Adding news | Website should have text area to write new pages with tools for editing text. Button “save draft” to continue editing later, “publish” to push this news on main page.
Deleting news | Website should have button “delete” to remove news from website
Searching |  Website should have text field and button “find” to find any web page

#### 3.2\. Non-Functional Requierements <a name="3.2"></a>
##### 3.2.1\. Software Quality Attributes <a name="3.2.1"></a>
##### 3.2.1.1 External Quality Criteria <a name="3.2.1.1"></a>
That should work fast in every device that is popular now (nobody wants to use low-speed resources). Furthermore, that is important to make simple interface and beautiful design due to users like to use good-looking pages. As result it should be more popular.
### 4\. Analogues <a name="4"></a>
There is some analogues. User can make simple sites using [Blogspot](https://www.blogger.com/) and [Wix](https://wix.com/).
