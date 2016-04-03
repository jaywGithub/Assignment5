Courier System Domain Model

Introduction

Sending a package somewhere can get very frustrating as it is mostly on a strict time limit. This is where courier companies come in to make the process easy and quick for the customer. 
The process of sending a package activates a number of variables for any courier company. The software that is implemented should be able to make everything easier for the company and quick for the customer.
 
Description of the Domain Model

According to the domain model, a customer wants to send a package to a specified destination. The package has a size and a type. The type specify whether it’s an envelope or a box. The customer will have to provide his/her details as well as a description of the package and who will receive it.

Sending the package obviously comes with a cost. The cost is made up of the following: a distance cost which is determined by a scale based on the distance from the where it is send and the destination; a size cost which is determined by a scale based on the size of the package; a transport cost which is determined by a scale based on the type of transport selected. 

The options for transport include three mediums: regular, which is by truck, express1, which is by bakkie, and express2, which is by plane.

There are specific minimum requirements for the drivers and branch managers. A driver for the regular option needs to have a least a Code B driver’s license. A driver for the express1 option needs to have at least a Code C driver’s license. A driver for the express2 option needs to have at least been part of an accredited pilot training course and in possession of a valid pilot license.
