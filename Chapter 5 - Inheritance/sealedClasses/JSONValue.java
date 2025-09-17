package sealedClasses;

abstract sealed class JSONValue permits JSONArray, JSONNumber {

}

final class JSONArray extends JSONValue {

}

final class JSONNumber extends JSONValue {

}

// ERROR
/*
 * final class JSONComment extends JSONValue {
 * 
 * 
 * }
 */