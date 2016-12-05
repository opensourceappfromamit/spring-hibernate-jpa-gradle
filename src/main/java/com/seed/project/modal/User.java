package com.seed.project.modal;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "LD_USER")
public class User extends BaseEntity implements Serializable{
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "password_hash")
    private String passwordHash;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "one_liner")
    private String oneLiner;

    @Column(name = "facebook_profile")
    private String facebookProfile;

    @Column(name = "twitter_profile")
    private String twitterProfile;

    @Column(name = "instagram_profile")
    private String instagramProfile;

    @Column(name = "pinterest_profile")
    private String pinterestProfile;

    @Column(name = "gplus_profile")
    private String gplusProfile;

    @Column(name = "profile_image_location")
    private String profileImageLocation;

    @Column(name = "avatar")
    private String avatarLocation;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getOneLiner() {
        return oneLiner;
    }

    public void setOneLiner(String oneLiner) {
        this.oneLiner = oneLiner;
    }

    public String getFacebookProfile() {
        return facebookProfile;
    }

    public void setFacebookProfile(String facebookProfile) {
        this.facebookProfile = facebookProfile;
    }

    public String getTwitterProfile() {
        return twitterProfile;
    }

    public void setTwitterProfile(String twitterProfile) {
        this.twitterProfile = twitterProfile;
    }

    public String getInstagramProfile() {
        return instagramProfile;
    }

    public void setInstagramProfile(String instagramProfile) {
        this.instagramProfile = instagramProfile;
    }

    public String getPinterestProfile() {
        return pinterestProfile;
    }

    public void setPinterestProfile(String pinterestProfile) {
        this.pinterestProfile = pinterestProfile;
    }

    public String getGplusProfile() {
        return gplusProfile;
    }

    public void setGplusProfile(String gplusProfile) {
        this.gplusProfile = gplusProfile;
    }

    public String getProfileImageLocation() {
        return profileImageLocation;
    }

    public void setProfileImageLocation(String profileImageLocation) {
        this.profileImageLocation = profileImageLocation;
    }

    public String getAvatarLocation() {
        return avatarLocation;
    }

    public void setAvatarLocation(String avatarLocation) {
        this.avatarLocation = avatarLocation;
    }
}
