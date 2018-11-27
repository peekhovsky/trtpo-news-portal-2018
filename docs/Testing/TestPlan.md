# Test Plan
### Contents
1. [Introduction](#1)<br>
2. [Quality attributes](#2)<br>
  2.1. [Functionality](#2.1)<br>
  2.2. [Platform support](#2.2)<br>
  2.3. [Using](#2.3)<br>
4. [Software Risk Issues](#3)<br>
5. [Testing](#4)<br>
6. [Approaches](#5)<br>
7. [Results](#6)<br>
8. [Сonclusion](#7)<br>

### 1. Introduction <a name="1"></a>
This test plan is intended to test [News portal](https://github.com/peekhovsky/trtpo-news-portal-2018/tree/master/app/newsportal) web-application. Main purpose of testing is to check software functionality and performance.


### 2. Quality attributes <a name="2"></a>

## 2.1. Functionality <a name="2.1"></a>
- app should perform all declared in SRS functions and should do it in right way with no bugs, slowdowns etc.;
- app should have security system to avoid hacking;
- app should not have extended functionality that is not declared in SRS (to avoid complexity of use).

## 2.2. Platform support <a name="2.2"></a>
- app should work in all devices that have bwowser and have access to the Internet;
- app should be displayed correctly on PC.

## 2.3. Using <a name="2.3"></a>
- app should be easy and convenient to use (not much buttons and useless information);
- app should look simple and attractive to user.

<a name="3"></a>
### 3. Software Risk Issues
Application don't have perfect security system, so if user has easy to hack identification data, malefactor can access to personal data.

<a name="4"></a>
### 4. Testing phases
There is main testing phases to test this application: 
- opening of main page;
- browsing news using numbers of pages;
- opening full news page;
- login in using correct data;
- impossibility to log in using incorrect date;
- logging out;
- adding news;
- deleting news;
- possibility to add news from drafts.

<a name="5"></a>
### 5. Approaches

<a name="6"></a>
### 6. Results
Results are located in this file: [results](https://github.com/peekhovsky/trtpo-news-portal-2018/blob/master/docs/Testing/TestResults.md)
<a name="7"></a>
### 7. Conclusion
