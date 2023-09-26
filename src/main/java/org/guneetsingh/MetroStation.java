package org.guneetsingh;

import java.util.Objects;

public class MetroStation {
  private final String name;
  private final String color;


  public MetroStation(String name, String color) {
    this.name = name;
    this.color = color;
  }


  public String getName() {
    return name;
  }


  public String getColor() {
    return color;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof MetroStation) {
      MetroStation other = (MetroStation) obj;
      return this.name.equals(other.name);
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }


  @Override
  public String toString() {
    return name;
  }
}
