package com.example.demo;

import lombok.Data;
import org.springframework.cloud.gcp.data.spanner.core.mapping.*;

@Table(name="Yoga_Poses")
@Data
class Yoga {
  @PrimaryKey(keyOrder = 1)
  
  @Column(name="Pose_Id")
  private int poseId;

  public int getPoseId() {
    return poseId;
}
public void setPoseId(int poseId) {
    this.poseId = poseId;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getBreath() {
    return breath;
}
public void setBreath(String breath) {
    this.breath = breath;
}
public String getDesc() {
    return desc;
}
public void setDesc(String desc) {
    this.desc = desc;
}
@Column(name="Name")
  private String name;

  @Column(name="Breath")
  private String breath;

  @Column(name="Description")
  private String desc;
}