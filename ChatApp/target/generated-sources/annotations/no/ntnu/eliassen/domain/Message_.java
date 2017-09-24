package no.ntnu.eliassen.domain;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import no.ntnu.eliassen.domain.Conversation;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-24T20:04:50")
@StaticMetamodel(Message.class)
public class Message_ { 

    public static volatile SingularAttribute<Message, Long> id;
    public static volatile SingularAttribute<Message, String> text;
    public static volatile SingularAttribute<Message, String> user;
    public static volatile SingularAttribute<Message, Timestamp> version;
    public static volatile SingularAttribute<Message, Conversation> conversation;

}