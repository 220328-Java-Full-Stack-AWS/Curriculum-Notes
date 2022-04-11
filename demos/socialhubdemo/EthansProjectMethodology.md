1. Setup my package structure
    - Break up my project into separate layers
    - Typically I will include at least these layers for my java backend
      - models
        - Literally modeling whatever we are building
      - services
        - The code that does the actual computation/logic of your program
        - These classes will typically be called upon from the main method or the controller layer
        - Also they will typically modify your models
      - dao (data access object/data layer)
      - controller (to be seen later)

2. Figure out my models, and complete said models

User:
   - String Email
   - String First
   - String Last
   - String Username
   - String Password
   - List Posts
   - Set Followers
   - Set Following

Post:
   - String Content
   - User User
   - Date Timestamp

3. For a console application, I want to figure out my service methods, and the event loop of the application
    - The way that figure out the logic in the service is by determining the flow
    - Register a user -> Login a user -> Look at feed -> Create Post
      - -> Follow User -> Search users to follow

4. As I need database access in my Services, I will create the needed access in DAO classes
   - For our example, I am just going to create a simple Map to store the users with their username as keys