# Test Plan
### Contents
1. [Introduction](#1)<br>
2. [Quality attributes](#2)<br>
  2.1. [Functionality](#2.1)<br>
  2.2. [Platform support](#2.2)<br>
  2.3. [Using](#2.3)<br>
3. [Software Risk Issues](#3)<br>
4. [Testing](#4)<br>
4.1. [Functional testing aspects](#4.1)<br>
  4.1.1 [Opening of main page](#4.1.1)<br>
  4.1.2.[Browsing news using numbers of pages](#4.1.2)<br>
  4.1.3.[Opening of full news page](#4.1.3)<br>
  4.1.4.[Authorization](#4.1.4)<br>
  4.1.5.[Loging out](#4.1.5)<br>
  4.1.6.[Adding news](#4.1.6)<br> 
  4.1.7.[Deleting news](#4.1.7)<br> Deleting news
5. [Results](#5)<br>
6. [Сonclusion](#6)<br>

### 1. Introduction <a name="1"></a>
This test plan is intended to test [News portal](https://github.com/peekhovsky/trtpo-news-portal-2018/tree/master/app/newsportal) web-application. Main purpose of testing is to check software functionality and performance.


### 2. Quality attributes <a name="2"></a>

#### 2.1. Functionality <a name="2.1"></a>
- app should perform all declared in SRS functions and should do it in right way with no bugs, slowdowns etc.;
- app should have security system to avoid hacking;
- app should not have extended functionality that is not declared in SRS (to avoid complexity of use).

#### 2.2. Platform support <a name="2.2"></a>
- app should work in all devices that have bwowser and have access to the Internet;
- app should be displayed correctly on PC.

#### 2.3. Using <a name="2.3"></a>
- app should be easy and convenient to use (not much buttons and useless information);
- app should look simple and attractive to user.

<a name="3"></a>
### 3. Software Risk Issues
Application don't have perfect security system, so if user has easy to hack identification data, malefactor can access to personal data.

<a name="4"></a>
### 4. Testing aspects
#### 4.1. Functional testing aspects
There is main fuctional testing phases to test this application: 
#### 4.1.1. Opening of main page
This aspect should be tested on:
- opening of main page using link;
- correctly displayed data after loading (all web-items is it their places)
#### 4.1.2. Browsing news using numbers of pages
This aspect should be tested on:
- opening of any page user wants using page buttons.
#### 4.1.3. Opening of full news page
This aspect should be tested on:
- opening of full page any of news;
- correctly displayed data after loading (all web-items is it their places).
#### 4.1.4. Authorization
This aspect should be tested on:
- succesful authorization using correct identification data;
- failed authorization using incorrect identification data;
- correctly displayed identification data (name of user and login) after authorization.
#### 4.1.5. Loging out
This aspect should be tested on:
- succesful loging out after pushing log out button.
- correctly displayed pages after loging out (with no signs of user).
#### 4.1.6. Adding news
This aspect should be tested on:
- correctly displayed adding news page;
- adding news with title, description and text (allows html-insertions);
- correctly displayed page after its adding (title, description, text, date, author); 
- inability to add news without authorization.
#### 4.1.7. Deleting news
This aspect should be tested on:
- correctly displayed delete buttons after authorisation;
- deleting news;
- displaying of news list without news that has been deleted.

<a name="5"></a>
### 5. Results
Results are located in this file: [results](https://github.com/peekhovsky/trtpo-news-portal-2018/blob/master/docs/Testing/TestResults.md).
<a name="6"></a>
### 6. Conclusion
