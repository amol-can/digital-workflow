enum Module{
    Study_Level_Content,
    Protocol_Level_Content
}
export class StudyDesignElement {
    public elementId: number;
    
    constructor(    
    public studyDesignElement: string,
    public module: Module,
    public label: string,
    public active: boolean,
    public guidanceText: string,
    public multiplePossible: boolean,
    public required: boolean
    ){}

}