export class StudyDesignElement {
    constructor(
    public studyDesignElement: string,
    public module: string,
    public label: string,
    public active: boolean,
    public guidanceText: string,
    public multiplePossible: boolean,
    public required: boolean
    ){}

}