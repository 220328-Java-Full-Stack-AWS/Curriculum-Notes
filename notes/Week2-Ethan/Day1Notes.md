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

