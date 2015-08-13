package com.uber.executer.models;

import android.content.Context;

/**
 * Created by aliyuolalekan on 8/12/15.
 */
public class BookedEvent {
  Context context;
  public BookedEvent(){

  }
  public BookedEvent(Context context){
    this.context = context;

  }
  BookedEvent(String summary,String eventTime) {
    this.summary=summary;
    this.eventTime=eventTime;
  }

  public void setSummary (String summary) {

    this.summary = summary;
  }

  public String getSummary () {
    return summary;
  }

  String summary;
  String eventName;
  String eventTime;
  String eventLocation;
  String pickUpLocation;
  String eventDestination;

  public void setEventName (String eventName) {
    this.eventName = eventName;
  }

  public void setEventTime (String eventTime) {
    this.eventTime = eventTime;
  }

  public void setEventLocation (String eventLocation) {
    this.eventLocation = eventLocation;
  }

  public void setPickUpLocation (String pickUpLocation) {
    this.pickUpLocation = pickUpLocation;
  }

  public void setEventDestination (String eventDestination) {
    this.eventDestination = eventDestination;
  }

  public String getEventName () {
    return eventName;
  }

  public String getEventTime () {
    return eventTime;
  }

  public String getEventLocation () {
    return eventLocation;
  }

  public String getPickUpLocation () {
    return pickUpLocation;
  }

  public String getEventDestination () {
    return eventDestination;
  }

  public void getPickUpLocation (String pickUpLocation) {

  }
}
