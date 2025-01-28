package gr.aueb.cf.ch17.knight;

@FunctionalInterface
public interface IKnight {

    IMission[] missions = {
            new KillTheDragonMission(),
            new SaveThePrincessMission(),
            new KillTheDragonMission(),
            new SaveThePrincessMission()
    };

    void embarkOnMission(IMission mission);
}
