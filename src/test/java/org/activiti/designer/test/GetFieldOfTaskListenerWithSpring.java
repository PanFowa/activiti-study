package org.activiti.designer.test;

import org.activiti.engine.RuntimeService;
import org.activiti.engine.test.Deployment;
import org.activiti.spring.impl.test.SpringActivitiTestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration("classpath:applicationContext-test.xml")
public class GetFieldOfTaskListenerWithSpring extends SpringActivitiTestCase {
  
  @Autowired
  RuntimeService runtimeService;

  @Deployment(resources = "diagrams/qun/GetFieldOfTaskListener.bpmn")
  public void testField() {
    runtimeService.startProcessInstanceByKey("GetFieldOfTaskListener");
  }

}