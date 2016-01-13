class Solution(object):
    def getHint(self, secret, guess):
        """
        :type secret: str
        :type guess: str
        :rtype: str
        """
        slist = [0]*10
        glist = [0]*10
        bull = 0
        cow = 0
        for index in range(0,len(secret)):
            if secret[index] == guess[index]:
                bull += 1
            else:
                slist[int(secret[index])] += 1
                glist[int(guess[index])] += 1
        else:
            for i in range(0,10):
                cow += min(slist[i], glist[i])
            else:
                result = str(bull)+"A"+str(cow)+"B"
                return result