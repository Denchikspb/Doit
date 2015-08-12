package entities;

import java.util.Date;

// REVIEW DATE: 11.08.2015
// REVIEWER: ALMAZ


/**
 * ����� ��� �������� � ������ � �������
 * @author Anatoly
 */
public class Task extends AbstractTask {
    /** ������� �������� ������ */
    private short impDeg;
    /** ������ ���������� ������ */
    private boolean complete = false;
    /** ������������ */
    private Attachment attachment;

    /**
     * ������������� ����� {@link Task#name}, {@link Task#startDate}, {@link Task#attachment}
     * @param name ���
     * @param start ���� ������
     * @param attch ������������
     */
    public Task(String name, Date start, Attachment attch) {
        super(name, start);
        //this.setImportance();
        this.addAttachment(attch);
    }

    /**
     * ��������� ������� �������� ������
     * @param imDeg 
     */
    public void setImportance(short imDeg) {
        this.impDeg = imDeg;
    }

    /**
     * ���������� ������� �������� ������
     * @param imDeg
     * @return ����� ����� - ������� ��������
     */
    public short getImportance(short imDeg) {
        return this.impDeg;
    }

    /**
     * ������ ���������� ������
     * @return false - �� ���������, true - ���������
     */
    public boolean isComplete() {
        return this.complete;
    }

    /**
     * ��������� ������� ���������� ������
     */
    public void switchComplete() {
        this.complete = !this.complete;
    }

    /**
     * �������� ������������
     */
    public final void deleteAttachment() {

    }

    /**
     * ���������� ������������
     * @param attch 
     */
    public final void addAttachment(Attachment attch) {
        attachment = attch;
    }
    
    /**
     * �������������� ������
     */
    @Override
    public void editTask(){
        
    }
}
