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
4. [Analogues](#4) <br>

### 1\. Intoduction <a name="1"></a>
Physical newspapers are dying nowadays because people use their devices to be informed about everything that happens around. That would be useful for news company to have good equipment to make their web newspaper easier.
That is what we are going to make in this project.

### 2\. User Requirements <a name="2"></a>
#### 2.1\. Software Interfaces <a name="2.1"></a>
This app uses relational database for storing data and does not interract with external systems and libraries.
#### 2.2\. User Interfaces <a name="2.2"></a>
There are mocups of [main page](https://raw.githubusercontent.com/peekhovsky/trtpo-news-portal-2018/master/docs/Mockups/main-page.png) and [news editing](https://raw.githubusercontent.com/peekhovsky/trtpo-news-portal-2018/master/docs/Mockups/news-editing.png).
Interface should be simple for both regular user (who just read this site) and admin (who update infromation). Description of what every button should do is down below.

For usual user:

Button | Event
--- | ---
"Find" | Finds news depending on your text in the text field
"Read more" | Opens page to see full text
"Share" | Shares this news in any social network

For admin mode: 

Button | Event
--- | ---
"Sign in" | Goes to admin version depending on admin's login and password 
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

#### 3.1\. Functional Requirements <a name="3.1"></a>

For plain user:

Function | Requirements
--- | ---
Reading news | The website should have simple interface with possibility to observe many news with small description in one page. Pushing link/button “read more” to see full information
Searching |   The website should have text field and button “find” to find any web page
Sharing | The website should have tools to share this news in social networks

For administrator:

Function | Requirements
--- | ---
Switching to admin mode |  The website should have a part responsible for singing in admin profile. Text fields for login and password and button “sign in”.
Adding news |  The website should have text area to write new pages with tools for editing text. Button “save draft” to continue editing later, “publish” to push this news on main page.
Deleting news |  The website should have button “delete” to remove news from website
Adding new administrator | The website should have tools for adding new users responsible for updating. Once an admin added new users, he should set an access level for them.  


#### 3.2\. Non-Functional Requierements <a name="3.2"></a>
##### 3.2.1\. Software Quality Attributes <a name="3.2.1"></a>
Project must be simple to use (4-5 buttons and text fields on every page), and light-weight (should not have lags on non-powerful devices, and should load fast even if user have low-speed connection). Aslo, that is important to have safe security system (it might be hacked by trespassers when it becomes popular).  

### 4\. Analogues <a name="4"></a>
There is some analogues. User can make simple sites using [Blogspot](https://www.blogger.com/) and [Wix](https://wix.com/). The main disadvantage of that site is that sites have an excess of functionality. Our project simplifies the process of editing news. 
