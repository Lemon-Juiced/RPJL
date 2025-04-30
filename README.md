# RPJL (Rob's Professional Java Library)
RPJL, short for Rob's Professional Java Library, is a collection of Java classes and utilities built mainly for 
professional endeavors, but is also suitable for personal projects.

## Features (Problems & Solutions)
Each of the packages in this library serve a specific purpose, typically related to a specific problem.

### IP
Utilities for working with IP addresses, including conversion between different formats and CIDR notation.
#### Address (IPv4 and IPv6)
**Problem:** Java does not natively support IP addresses in an easily-manipulable format.
**Solution:** A set of classes that can convert between IP addresses and their string representations.  
              This includes both IPv4 and IPv6 addresses.
#### CIDR (IPv4 and IPv6)
**Problem:** Converting between CIDR notation and IP addresses can be tedious.  
**Solution:** A set of classes that can convert between CIDR notation and IP addresses.  
              This includes both IPv4 and IPv6 addresses.  
              Additionally, a Common Class is provided, which can handle arbitrary ranges.

### DatabaseUtils
**Problem:** The standard `ResultSet` class is forward-only meaning it can only be read once.  
**Solution:** Easier conversion between `ResultSet` and `CachedRowSet`, `ResultSet`'s non-forward-only cousin.  

### DoubleString
**Problem:** Occasionally, you need to return two Strings from a method.  
**Solution:** A simple class that holds two Strings and provides a few utility methods.  
              Since, these are Strings, getters and setters can be utilized to manipulate the internal values.

### JSONParser & JSONTree
**Problem:** Parsing JSON data can be cumbersome and error-prone.  
**Solution:** A representation of JSON data as a tree structure, allowing for easy manipulation and access to data.  
**Note:** 🔴 WIP (Incomplete)

## Notice
This library is in development and may not function as intended.  
Any portions denoted with a "🔴 WIP (Incomplete)", are not ready to use or not tested.  
If you care for code stability and functionality avoid these portions of the library.  

**Use at your own risk.**
