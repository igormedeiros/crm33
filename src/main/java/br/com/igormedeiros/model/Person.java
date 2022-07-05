package br.com.igormedeiros.model;

import java.util.Map;

public class Person {
  private String firstName;
  private String lastName;
  private String email;
  private Map<String, String> channels;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Map<String, String> getChannels() {
    return channels;
  }

  public void addChannel(String channel, String value) {
    channels.put(channel, value);
  }

  public String getChannels(String channel) {
    return channels.get(channel);
  }
}
