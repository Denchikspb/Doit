/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;
import java.util.Date;

// REVIEW DATE: 11.08.2015
// REVIEWER: ALMAZ


/**
 * �����, ����������� ���� � ������ ��� ������ � ��������
 * ����������� �� {@link AbstractTask}
 * @author Anatoly
 */
public class Project extends AbstractTask {
    /** 
     * ��������� ����� ({@link Task})
     * @see Task
     */
    private ArrayList<Task> tasks;
    /**
     * ���� ��� �������� ��������, ������� �������� �� ������ � �������
     * false - ���������, true - ������ �������������
     * @see Access
     */
    private boolean owner;

    /**
     * ������������� ���� {@link Project#name} � {@link Project#startDate}
     * @param name ���
     * @param start ���� ������
     */
    public Project(String name, Date start) {
        super(name, start);
        this.owner = false;//�� ��������� ������ ����� ������ ��������� �������
    }

    /**
     * �������������� ������, ������������� � �������
     * @param t 
     * @see Task
     */
    public void editTask(Task t) {
        t.editTask();
    }
    
    /**
     * �������� ������, ������������� � �������
     * @param t 
     * @see Task
     */
    public void deleteTask(Task t){
        
    }
    
    /**
     * ���������� ������ � �������
     * @param t 
     * @see Task
     */
    public void addTask(Task t){
        
    }
}
