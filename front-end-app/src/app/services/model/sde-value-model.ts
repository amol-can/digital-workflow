enum ElementValueState {
    ACTIVE, INACTIVE, OBSOLETE
}

export class StudyDesignElementValue{
    public elementValuesId: number;
    constructor(
        public studyDesignElement: string,
        public value: string,
        public state: ElementValueState,
        public definition: string,
        public displayOrder: number
    ){}

}