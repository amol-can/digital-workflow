import { StudyLevelContent } from './study-level-content-model';

export class Objective {
    public id: number;
    constructor(
        public protocolId: string,
        public objectiveFullText: string,
        public objectiveLevel: string,
        public endPointFullText: string,
        public primaryTimePoint: string,

        //public studyLevelContent: StudyLevelContent

    ) { }
}