package doit.core.entites;

import java.util.Date;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

// REVIEW DATE: 11.08.2015
// REVIEWER: ALMAZ


/**
 * Класс для хранения и работы с задачей
 * @author Anatoly
 */
@XmlRootElement(name = "task")
@XmlType(name = "", propOrder = {"name", "description", "startDate", "finishDate", "attachmentList", "impDeg", "complete"})
public class DoitTask extends DoitAbstractTask {
    /** Степень важности задачи */
    private short impDeg;
    /** Статус завершения задачи */
    private boolean complete = false;

    /**
     * Инициализация полей {@link DoitTask#name}, {@link DoitTask#startDate}, {@link DoitTask#attachment}
     * @param name Имя
     * @param start Дата начала
     * @param attachment Прикрепление
     */
    public DoitTask(String name, Date start, DoitAttachment attachment) {
        this.name = name;
        this.startDate = start;
        this.attachmentList.add(attachment);
    }
    public DoitTask(String name, Date start) {
        this.name = name;
        this.startDate = start;
    }
    public DoitTask(String name) {
        this.name = name;
    }
    
    public DoitTask(){
        super();
    }

    /**
     * TODO: Создайте enum - не извращайтесь плиз с этим шортом
     *
     * enum TASK_PRIORITY{
     *     PRIORITY_1, [замените на нормальное название]
     *     PRIORITY_2, [замените на нормальное название]
     *     PRIORITY_3, [замените на нормальное название]
     *     etc...
     * }
     *
     * Изменение степени важности задачи
     * @param imDeg 
     */
    @XmlAttribute(name = "impDeg")
    public void setImpDeg(short imDeg) {
        this.impDeg = imDeg;
    }

    /**
     * Возвращает степень важности задачи
     * @return Целое число - степень важности
     */
    public short getImpDeg() {
        return this.impDeg;
    }

    /**
     * Статус завершения задачи
     * @return false - не завершена, true - завершена
     */
    public boolean isComplete() {
        return this.complete;
    }
    
    @XmlAttribute(name = "complete")
    public void setComplete(boolean b){
        this.complete = b;
    }
    
    public boolean getComplete(){
        return this.complete;
    }

    /**
     * Изменение статуса завершения задачи
     */
    public void switchComplete() {
        this.complete = !this.complete;
    }
    
}
