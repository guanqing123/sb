package com.mooc.sb.ioc.xml;

/**
 * @description: TODO 类描述
 * @Author guanqing
 * @Date 2021/5/5 11:16
 **/
public class HelloService {

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    private Student student;

    public String student(){
        return student.toString();
    }

    public Stu2 getStu2() {
        return stu2;
    }

    public void setStu2(Stu2 stu2) {
        this.stu2 = stu2;
    }

    private Stu2 stu2;

    public String stu2(){
        return stu2.toString();
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    private Animal animal;

    public String animal(){
        return animal.getName();
    }

    public Animal getInstance() {
        return instance;
    }

    public void setInstance(Animal instance) {
        this.instance = instance;
    }

    private Animal instance;

    public String instance(){
        return instance.getName();
    }
}
