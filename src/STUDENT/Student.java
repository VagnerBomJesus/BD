/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package STUDENT;

/**
 *
 * @author vbj
 */
public class Student {
    
    String firtName;
    String lastName;
    int age;
    int contact;

    @Override
    public String toString() {
        return "Aluno{" + "firtName=" + firtName + ", lastName=" + lastName + ", age=" + age + ", contact=" + contact + '}';
    }

    

    
    public Student(String firtName, String lastName, int age, int contact) {
        this.firtName = firtName;
        this.lastName = lastName;
        this.age = age;
        this.contact = contact;
    }

    public String getFirtName() {
        return firtName;
    }

    public void setFirtName(String firtName) {
        this.firtName = firtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }
    
    
    
}
