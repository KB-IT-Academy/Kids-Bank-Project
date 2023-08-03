package dto;

public class ParentChildDto {
    private int parentChildNum; // 고유번호
    // FK
    private ChildDto childDto; // childNum
    private ParentDto parentDto; // parentNum

    // 자식순서: 1. 첫째, 2.둘째, 3.셋째
    private int childOrder;

    /**
     * 생성자
     */
    public ParentChildDto(int parentChildNum, ChildDto childDto, ParentDto parentDto, int childOrder) {
        this.parentChildNum = parentChildNum;
        this.childDto = childDto;
        this.parentDto = parentDto;
        this.childOrder = childOrder;
    }

    /**
     * toString()
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ParentChildDto{");
        sb.append("parentChildNum=").append(parentChildNum);
        sb.append(", childNum=").append(childDto.getChildNum());
        sb.append(", parentDto=").append(parentDto.getParentNum());
        sb.append(", childOrder=").append(childOrder);
        sb.append('}');
        return sb.toString();
    }
}
