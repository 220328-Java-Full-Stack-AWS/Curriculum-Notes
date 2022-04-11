# SDLC (Software Development Lifecycle):

Outlines the process to plan, create, test, and deploy information systems and applications

## SDLC Follow these 7 general steps:

1. Requirements Phase
2. Analysis Phase
3. Design Phase
4. Development Phase
5. Testing Phase
6. Integration and Deployment Phase
7. Maintence Phase

There are two main approaches to SDLQ currently:

- Waterfall
- Agile

## Waterfall

Waterfall is a linear approach, as you finish on of those steps, you move onto the next, there is no going back

##  Typical Timeline of Waterfall

- Requirements phase: 2-4 weeks
- Planning phase: 2-4 weeks
- Design phase: 1-4 months
- Development phase: 6-12+ months
- Testing phase: ~6 months, but actually ongoing
- Deployment phase: 1-3 weeks
- Maintenance phase: lifetime of the application

## Advantages vs Disadvantages

Advantages of Waterfall
- Easy to manage workflow
- Well suited for small teams, or short term projects, that will not require any requirement changes
- Generally result in faster delivery of product
- Process and results can easily be documented
- Easy to adapt to shifting teams since the steps are clearly laid out

Disadvantages of Waterfall
- Very inflexible and inefficient
- Not ideal for large team projects
- Testing does not begin until development is complete

## Agile

Agile is an iterative approach to SDLC, go through every step of the SQL in 2 - 4 weeks

Agile is becoming more widely acceptec, and utilized method of SDLC because of its core values:
- Individuals and Interactions over processes and tools
- Working software over comprehensive documentation
- Customer collaboration over contract negotiation
- Responging to change over following a plan

## Advantages vs Disadvantages

Advantages of Agile
- Client collaboration is generally regarded as positive
- Agile team cultures tend to stay more self-organized and motivated
- Overall quality of products is usually higher due to the iterative approach
- Less risk in development process due to incremental nature of development

Disadavantages of Agile
- Not as useful for smaller development projects
- Higher costs associated with Agile workflow
- Development time can bloat if managed poorly, or requirements are not clear
- Requires more experienced members during the planning and management of projects

# Agile/Scrum Concepts

Scrum is the simplest Agile framework, it enforces ceremonies lead by a lead who ensure the team is following scrum practices

## Scrum Artifacts

- Product Owner: hold authority over the project, a representative of client/customer
- Scrum Master: the person who mediates all of the meetings, they are going to go between the client and the team
- Project Backlog: holds all the current requirements for the project
- Sprint Backlog: requirements that we want to complete during this sprint/development block of 2-4 weeks
- User Story: an individual feature/requirement
- Epic: a group of related features thiat is broken down into multiple user stories
- Sprint: a brief period of development (between 2 to 4 weeks), which generally cumulate in a release of related features
- Velocity: the sum story points of all user stories completed for the sprint
    - story points are points based on the difficulty of the feature being implemented

## Story Pointing

Story pointing allows teams to keep track of the progress (velocity)  of their sprint/project, and create burndown charts

Burndown charts: chart the amount of story points that have been completed each day, vs the number of points remaining in the backlog/sprint backlog

![burndown](burndown.PNG)

When assigning story points, it should be a team discussion, that includes consideration of Risk, Complexity, and Repetition of the user story

## Scrum Ceremonies

meetings used during the life cycle of the spring in a project

Sprint Planning Meeting
- Include the entire dev team, scrum master, product
- Happen before every sprint
- Determine the scope, goals, and metrics of the sprint

Daily Standup/Scrum:
- This is a daily meeting lead by scrum master
- Takes about 15 minutes
- Everyone tells what they working on, what they are stuck on, and their goals are
    - What they did, blockers, goals

Sprint Review:
- Everyone is invited to this meeting
- Review what the team accomplished at the end of the sprint
- Gain feedback

Sprint Retrospective:
- Scrum master reviews the metrics, and assesses and ineffiencies
- Plan to make improvements as a team

# Git Branching Basics

Every project has at least one branch, this is know as the main or the master branch
- This is where we want our working version of our project

The `HEAD` points to the most recent commit that you have made, as you make more commits the head will move to the most recent

The main branch is seen as a timeline of versions of the entire project

Branching is a strategy to create a copy of a branch, typically the main branch to start out, and make changes to that code independent of the main branch

Brances are typically used to create new features separate from the main branch to protect it from bugs

Once the feature is implemeted successfully you can combine the new code back into the main branch, this is what we call merging

There are a couple different ways to create a branch with git

1. Use the two step approach
    - Create the branch`git branch <branchname>`
    - Checkout/switch to that branch `git checkout <branchname>`
2. Using one single command
    - Create the branch and check it out/switch to it in one go
    - `git checkout -b <branchname>`

We can view all of our local branches using `git branch`

We can view all of our remote branches using `git branch -r`

When a new branch is created, it will contain the current version of main (or what ever branch you branched off of)

You can then create, and make changes to files in this new branch, and follow the same git flow

When you are ready to combine changes from the feature branch to your main branch, you want to use `git merge <branchname>`

Keep in mind, you want to run this command from the branch you want to merge INTO

## Merge Conflicts

Merge conflicts occur when the same code is modified on multiple branches. Because the code was changed on multiple branches, git does not know which code to commit on the branch you are attempting to merge into

You will be unable to complete the merge until the conflich is resolved and commited

To resolve the merge conflict you will need to open the conflicting file in a text editor, and choose which version you would like to commit to the repository
- Sometimes you can see the conflict text in your IDE, but sometimes it doesn't show up. So the easiest way to fix conflicts are text editors on the command line

After you have fixed up the conflict, you can commit the changes and the merge should go through


This text is different, we are trying to cause a conflict

# Gitflow and Branching Strategies

Git flow is a command line tool that can be used with git for applications that need a more complext work flow

Git flow is a git workflow designed by Vincent Driessen and NVIE.

It is a robust framework for managaing larger projects by defining a strict branching model designed around project release

If you wanted to use the command line tool, you can simply run git flow init in your gitbash on widows

Or on MacOS install gitflow with homebrew and run it

The Command line tool will walk you through setting up each of the branches to be used in the workflow

These will include
- Main
- Development Branch / Next Release
- Feature Branches
- Hotfix branch

The git flow sets up thes strict branches to follow the work flow

Main branch
- Hold the current production build of your application

Development Branch
- Hold the code that is ready to be merged into the main branch

Feature Branches
- Individual features, one feature per branch
- As you finish up a feature, and it is working, you merge it into the development branch

Hotfix Branch
- If we need some very quick fix, we will branch off of main, fix the problem, then merge back into main

![branches](branches.PNG)

It is best practice to not automatically merge your code into a new branch, rather you should create a pull request.

The pull request essentially tells your leader/project manager that you code is ready for review and to be merged

Typically after you create a pull request, someone will review your code, this is to ensure quality, then the code will be merged into the requested branch

To create a pull request go to the repository on Github > Choose the `Pull Request` tab > Click on the green `New pull request` button

Clicking on the green button will walk you through making a pull request

# Protecting Branches on Github

On Github you can go into settings of your repository

Inside of settings you can choose the `Branches` tab and here you can see setting for your default branch and setup rules for other branches
- Something to note, you will only see the rules section if your repository is public, otherwise you will have to pay for a more advanced version of Github

Inside of the `add rule` section of `Branches` you can setup rules for different things such as:
- If a pull request is required before merging into a branch
- If the commit requires a status check
- If the commit needs a converstation resolution before merging
- If the branch requires signed commits
- Enforce restrictions on admins
- You should be able to restrict who pushes to the specified branch

# Arrays, VarArgs, and for-each loops

An object which stores elements of the same data type
- The elements are stored via index, with an array, each index is located next to one another in the physical memory of our application
- Array indexes start at 0, you access specific elements in the array by these indexes
- The array must be given a size when instantiated, and it CANNOT be resized
- The `length` property gives programmes access to the size of the array

There are multiple ways to declare an array:
- `datatype[] arr;`
- `datatype arr[];`

There are multiple ways to instantiate an array:
- `datatype[] arr = new datatype[size];`
- `datatype arr[] = {obj1, obj2, obj3};`

Arrays are considered objects, meaning we can store arrays inside of arrays, making multidimensional arrays
- These can be used to model matrixes, and be used to solve complex dynamix programming

To create multi-dimensional arrays we just add more brackets
- `datatype[][] arr`

The first set of indexes in our multi-dimension arrays are storing arrays
- These are similar to rows and columns
- `datatype[row][col] arr`;

## Var Args

Var args is a notation to pass an unset amount of parameters of a single data type

- Uses the ... notation
- There can only be one var arg in a method, and it must be the last parameter
- Var args get converted to arrays behind the scenes, so you can treat them just like arrays
- ``` java
    method(String pa1, Object pa2, int numbers ...){
        //get the 2nd value passed into varags
        int second = numbers[1];
    }
    method("Hellow", new Object(), 1,2,3,4,5,6);
    ```

## for-each (enhanced for loop)

Is what we considered an enhanced for loop.

It allows us to simply loop through all of the content of an array, or other data structure

We do not need to include any of the looping variables like a normal for loop

# Java Modifiers

Modifiers are keywords that modify the functionality of our java classes, methods, or class members
- Two types of modifiers are access and non-access

## Access Modifiers are keywords that define the ability of other classes to access the give entity

We have four available access modifiers in Java
- public : available anywhere
- protected : available within the same package and subclasses
- default (has no keyword): available within the same package only
- private : available only within the class

## Non-access modifiers modify the functionality of our java code, but the not availability
- There are technically 7 non-access modifers, but we will typically only use 4

`static` denote a class member has class/static scope
- if a variable or method is denoted with static scope that means that it belongs to the class
- The method can only access other static class members
- The variable will be the same across all of the object instances of this class
- We can also access static variables and methods directly through the class
    - `MyClass.staticVariable` or `MyClass.staticMethod()` 

`final` denotes whatever it is applied to is unchangeble
- when applied to a variable, you cannot reassign it once set
    - `public final String name = "Ethan";` this is a nono => `name = "Bob"`
- when applied to a class, you cannot extend that class
- when applied to a method, you cannot override that method

`abstract` keyword means two things depending on what is is applied to
- when it is applied to a class, the class can no longer be directly instantiated, you must now inherit it
- when applied to a method, the method must not have an implementation, it must be overriden in a child class
    - You are only allowed to create abstract methods in Abstract classes and interfaces

`transient` marks a variable as non-serializable
- If you were to write the object to a file, that field marked as transient would be ignored

# Variables Scopes

In the java programming language we have 4 different variable scopes

Each scope defines where the variable is accessible, and how long it is avaiable

The four scopes include:

Instance Scope: belong to the object itself
- Each individual object instantiated from the class will have its own value for that variable

Static Scope/Class Scope: the variable belongs to the class itself
- The variable will store the same value across all objects of that class
- If you change the value in one instance, it will change in all instances of that class

Method Scope: these are variables that are created inside of method blocks
- Once the method is done executing, the variable no longer exists
- You can't access the variable outside of the method block

Block Scope: these are variable that are created inside of specific blocks of code
- Typically going to be loops, if statements, switch...
- Once again, after the loop, or if statement, or whatever is finished running, the variable is no longer available
- You can't access the variable outside of the block of code

# Reading from the Console

So far we have just hard coded some data into our programs and ran them to see the output

What if we wanted to get data from our users in some other way?
- The simplest way is through the console

We can do this with the built in scanner class in Java

Most typically we will use System.in as the source for the scanner, this allows us to take input from the console

The Scanner class has methods to get entire lines of text, numbers, letters and more from the console