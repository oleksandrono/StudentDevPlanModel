package DevPlanModel.Knowledge;

public class Knowledge {
    private final int practicalKnowledge;
    private final int theoreticalKnowledge;
    private double learningRatio;

    public Knowledge(int practicalKnowledge, int theoreticalKnowledge, double learningRatio){
        this.practicalKnowledge = practicalKnowledge;
        this.theoreticalKnowledge = theoreticalKnowledge;
        this.learningRatio = learningRatio;
    }

    public int getPracticalKnowledge(int practicalKnowledge){
        return this.practicalKnowledge;
    }

    public int getTheoreticalKnowledge(int theoreticalKnowledge){
        return this.theoreticalKnowledge;
    }

    public double getLearningRatio(double learningRatio){
        return this.learningRatio;
    }

}
