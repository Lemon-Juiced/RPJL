# RPJL (Rob's Professional Java Library)
RPJL, short for Rob's Professional Java Library, is a collection of Java classes and utilities built mainly for 
professional endeavors, but is also suitable for personal projects.

## Features (Problems & Solutions)
Each of the packages in this library serve a specific purpose, typically related to a specific problem.

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
**Note:** <span style="background-color: red;">WIP</span>

## Notice
This library is in development and may not function as intended.  
Any portions denoted with a <span style="background-color: red;">WIP</span>, are not ready to use or not tested.  
If you care for code stability and functionality avoid these portions of the library.  

**Use at your own risk.**
