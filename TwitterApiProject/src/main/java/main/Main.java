package main;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;

public class Main {

	public static void main(String[] args) throws TwitterException {
		Twitter twitter = new TwitterFactory().getInstance();
		User user = twitter.verifyCredentials();

		System.out.println(
				"表示名 : " + user.getName() +
				"\nアカウント名 : " + user.getScreenName() +
				"\nフォロー数 : " + user.getFriendsCount() +
				"\nフォロワー数 : " + user.getFollowersCount());
	}

}
