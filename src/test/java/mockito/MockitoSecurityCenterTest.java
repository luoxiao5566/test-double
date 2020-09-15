package mockito;

import mock.DoorPanel;
import mock.SecurityCenter;

import org.junit.jupiter.api.Test;


import static org.mockito.Mockito.*;

public class MockitoSecurityCenterTest {

    @Test
    public void shouldVerifyDoorIsClosed() {
        DoorPanel doorPanel = mock(DoorPanel.class);

        SecurityCenter securityCenter = new SecurityCenter(doorPanel);

        securityCenter.switchOn();

        verify(doorPanel,times(1));
    }


}
