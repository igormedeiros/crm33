package br.com.igormedeiros.model;

@Entity (tableName = "tb_stage")
public class ModelStage {

    private String name;
    private int priority;
    private double probabilityToClose;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPriority() {
        return priority;
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }
    public double getProbabilityToClose() {
        return probabilityToClose;
    }
    public void setProbabilityToClose(double probabilityToClose) {
        this.probabilityToClose = probabilityToClose;
    }
    
}
