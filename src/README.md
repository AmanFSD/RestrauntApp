Title: Restaurant Queue Management System

Assignment:

You need to build a console application that simulates the queue management in a restaurant. The application must provide the following features:

Add customer to the queue: Each customer should be given a unique ID and a name when they enter the restaurant and are added to the queue.

Serve customer: The restaurant should serve the customer who has been waiting the longest (i.e., the first one in the queue). Once the customer is served, they should be removed from the queue.

Check the queue: The application should be able to print out the current queue at any time, showing the ID and name of each customer in the order they will be served.

Find a customer in the queue: Given a customer ID, the application should be able to find and print the details of a specific customer without removing them from the queue.

To implement the restaurant queue, you must use Java's Queue interface. You are free to use either the LinkedList or PriorityQueue classes, but remember that customers must always be served in the order they were added to the queue.

This assignment requires you to demonstrate understanding of Java's Queue interface, as well as basic programming concepts like loops, conditionals, and user input/output.

Deliverable:

A Java application that includes at least three classes: Main, Restaurant, and Customer. The Main class should handle user input and output, while the Restaurant class manages the queue and the Customer class represents individual customers.

Bonus Points:

If you want to take this assignment further, consider the following additions:

Capacity limit: The restaurant only has a certain number of seats. If the queue reaches the capacity limit, new customers should be turned away.

Priority queue: Some customers are VIPs and should be served before regular customers, even if they enter the restaurant later. Implement this using a priority queue instead of a regular queue.

Error handling: Make your program robust against incorrect user input, such as entering a string for a customer ID or trying to serve a customer when the queue is empty.