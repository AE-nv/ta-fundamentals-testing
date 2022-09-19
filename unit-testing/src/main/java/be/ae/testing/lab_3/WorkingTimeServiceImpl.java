package be.ae.testing.lab_3;

import java.time.LocalDateTime;

public class WorkingTimeServiceImpl implements WorkingTimeService {

    @Override
    public boolean isItWorkingTime() {
        int hours = LocalDateTime.now().getHour();
        return hours >= 10 && hours <= 12;
    }
}
