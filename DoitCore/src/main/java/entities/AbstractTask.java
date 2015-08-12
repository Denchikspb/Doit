/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;


// REVIEW DATE: 11.08.2015
// REVIEWER: ALMAZ


/**
 * ����������� �����, ����������� ����� ���� � ������, ��� ������ � ��������
 * @author Anatoly
 */
abstract public class AbstractTask {
    /** ��� */
    protected String name;
    /** �������� */
    protected String description;
    /** ���� ������ */
    protected Date startDate;
    /** ���� ���������� */
    protected Date finishDate;

    /**
     * �������������� ���� {@link AbstractTask#name} � {@link AbstractTask#startDate}
     * @param name ���
     * @param start ���� ������
     * @see AbstractTask
     */
    protected AbstractTask(String name, Date start) {
        setName(name);
        startDate = start;
    }

    /**
     * ��������������
     */
    public void editTask(){
        
    }
    
    /**
     * ��������� �����
     * final - ��� ������������� �������������� � �������� �������
     * @param name ����� ���
     */
    public final void setName(String name) {
        this.name = name;
    }

    /**
     * ��������� �����
     * final - ��� ������������� �������������� � �������� �������
     * @return ���
     */
    public final String getName() {
        return this.name;
    }

    /**
     * ���������� ��������
     * final - ��� ������������� �������������� � �������� �������
     * @return ��������
     */
    public final String getDescription() {
        return this.description;
    }

    /**
     * ��������� ������� �������� ({@link AbstractTask#description})
     * final - ��� ������������� �������������� � �������� �������
     * @param descr ����� ��������
     */
    public final void setDescription(String descr) {
        this.description = descr;
    }

    /**
     * ���������� ������ Date - ���� ������
     * final - ��� ������������� �������������� � �������� �������
     * @return ���� ������
     */
    public final Date getStartDate() {
        return this.startDate;
    }

    /**
     * ���������� ������ Date - ���� ����������
     * final - ��� ������������� �������������� � �������� �������
     * @return ���� ����������
     */
    public final Date getFinishDate() {
        return this.finishDate;
    }

    /**
     * ��������� �������� ���� ����������
     * final - ��� ������������� �������������� � �������� �������
     * @param finish ���� ����������
     */
    public final void setFinishDate(Date finish) {
        this.finishDate = finish;
    }
}
