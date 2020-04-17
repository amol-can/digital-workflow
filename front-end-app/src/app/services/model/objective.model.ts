import { StudyLevelContent } from './study-level-content-model';

export class Objective {
    public id: number;
    constructor(
        public protocolId: string,
        public objectiveFullText: string,
        public objectiveLevel: string,
        public studyLevelContent: StudyLevelContent

    ) { }
}